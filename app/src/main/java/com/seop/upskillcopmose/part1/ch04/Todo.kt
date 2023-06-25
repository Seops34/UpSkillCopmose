package com.seop.upskillcopmose.ch04

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoScreen() {
    val todoItems = remember { mutableStateListOf<Todo>() }
    var text by remember { mutableStateOf("") }

    Scaffold {
        Column(
            modifier = Modifier.padding(it)
        ) {
            InputBox(
                text = text,
                onTextChanged = { text = it }
            ) {
                val item = Todo(
                    key = (todoItems.firstOrNull()?.key ?: 0) + 1,
                    text = text
                )
                todoItems.add(item)
                text = ""
            }

            TodoItemList(
                todoItems = todoItems,
                onEdit = { key, editedText ->
                    val index = todoItems.indexOfFirst { item -> item.key == key }
                    val item = todoItems[index].copy(text = editedText)
                    todoItems[index] = item
                },
                onToggle = { key, checked ->
                    val index = todoItems.indexOfFirst { item -> item.key == key }
                    val item = todoItems[index].copy(done = checked)
                    todoItems[index] = item
                },
                onDelete = { key ->
                    val index = todoItems.indexOfFirst { item -> item.key == key }
                    todoItems.removeAt(index)
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputBox(
    text: String,
    onTextChanged: (String) -> Unit,
    onDone: () -> Unit
) {
    Row {
        OutlinedTextField(
            value = text,
            onValueChange = {
                onTextChanged(it)
            },
            modifier = Modifier.weight(1f)
        )

        Button(
            onClick = onDone
        ) {
            Text("입력")
        }
    }
}

@Composable
fun TodoItemList(
    todoItems: List<Todo>,
    onEdit: (key: Int, text: String ) -> Unit = { _, _ -> },
    onToggle: (key: Int, checked: Boolean) -> Unit = { _, _ -> },
    onDelete: (key: Int) -> Unit = {}
) {
    LazyColumn {
        items(
            items = todoItems,
            key = { todo -> todo.key}
        ) { item ->
            TodoItem(
                todo = item,
                onEdit = onEdit,
                onToggle = onToggle,
                onDelete = onDelete
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoItem(
    todo: Todo,
    onEdit: (key: Int, text: String ) -> Unit = { _, _ -> },
    onToggle: (key: Int, checked: Boolean) -> Unit = { _, _ -> },
    onDelete: (key: Int) -> Unit = {}
) {
    var isEditing by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.padding(4.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Crossfade(
            targetState = isEditing
        ) { state ->
            if (state) {
                val (editedText, setEditedText) = remember { mutableStateOf(todo.text) }

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedTextField(
                        value = editedText,
                        onValueChange = setEditedText,
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.size(4.dp))
                    Button(
                        onClick = {
                            onEdit(todo.key, editedText)
                            isEditing = false
                        }
                    ) {
                        Text("완료")
                    }
                }
            } else {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = todo.text,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = "완료"
                    )
                    Checkbox(
                        checked = todo.done,
                        onCheckedChange = { checked -> onToggle(todo.key, checked) }
                    )
                    Button(
                        onClick = {
                            isEditing = true
                        }
                    ) {
                        Text("수정")
                    }
                    Spacer(modifier = Modifier.size(4.dp))
                    Button(
                        onClick = { onDelete(todo.key) }
                    ) {
                        Text("삭제")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewTodoItem() {
    val todo = Todo(key = 1, text = "test")
    TodoItem(todo)
}

data class Todo(
    val key: Int,
    val text: String,
    val done: Boolean = false
)