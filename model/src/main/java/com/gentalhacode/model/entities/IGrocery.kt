package com.gentalhacode.model.entities

/**
 * .:.:.:. Created by @thgMatajs on 23/12/19 .:.:.:.
 */
interface IGrocery {
    var id: String
    val products: List<IProduct>
    val emailUsers: MutableList<String>
    val active: Boolean
}