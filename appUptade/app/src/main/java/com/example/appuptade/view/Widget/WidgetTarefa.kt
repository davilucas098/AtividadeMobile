package com.example.appuptade.view.Widget

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.unit.dp
import com.example.appuptade.model.Tarefa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WidgetTarefa(tarefa: Tarefa) {
    Box() {
        Row(
            modifier = Modifier.absolutePadding(
                left = 10.dp,
                top = 10.dp,
                right = 10.dp,
                bottom = 10.dp
            ).border(2.dp, Color.Black).background(Yellow)
        ) {
            Column{
                Box() {
                    var saverr by rememberSaveable {
                        mutableStateOf(tarefa.Titulo);
                    }

                    TextField(value = saverr, onValueChange = {
                        saverr = it
                    })
                }
                Box() {
                    Row() {
                        Box() {
                            var saverr by rememberSaveable {
                                mutableStateOf("Observações");
                            }

                            TextField(value = saverr, onValueChange = {
                                saverr = it
                            })
                        }
                        Box() {
                            var saverr by rememberSaveable {
                                mutableStateOf(tarefa.Data);
                            }

                            TextField(value = saverr, onValueChange = {
                                saverr = it
                            })
                        }

                    }
                }
                Row{
                    Text(modifier = Modifier.padding(end = 80.dp,start = 200.dp), text="Editar ")
                    Text(text="Feito")
                }
            }
        }

    }
}