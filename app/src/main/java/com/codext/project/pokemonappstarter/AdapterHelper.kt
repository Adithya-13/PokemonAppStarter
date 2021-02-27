package com.codext.project.pokemonappstarter

import android.widget.ImageButton

object AdapterHelper {
    fun String.urlToImageUrl(): String {
        val index = this.split("/".toRegex()).dropLast(1).last()
        return "https://pokeres.bastionbot.org/images/pokemon/$index.png"
    }

    fun ImageButton.setDrawableFavorite(isFavorite: Boolean) {
        this.setImageResource(if (isFavorite) R.drawable.ic_favorite else R.drawable.ic_favorite_border)
    }
}