package com.example.appuptade.view


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import com.example.appuptade.model.Tarefa
import com.example.appuptade.view.Widget.WidgetTarefa

@Composable
fun MainGui(){
    Box(){
        Text(modifier = Modifier.background(Blue).align(Alignment.BottomEnd), text = "+")
    }

    Column {
        var tarefa1 = Tarefa("Programação e Algoritimos", "13/08")
        WidgetTarefa(tarefa1)

        var tarefa2 = Tarefa("Java", "06/07")
        WidgetTarefa(tarefa2)

        var tarefa3 = Tarefa("PHP Orientado a Objetos", "25/03")
        WidgetTarefa(tarefa3)
    }
}