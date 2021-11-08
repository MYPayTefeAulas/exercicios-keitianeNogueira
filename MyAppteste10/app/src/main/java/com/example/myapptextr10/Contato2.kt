package com.example.myapptextr10

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contato2(var nome: String, var telefone: String): Parcelable
