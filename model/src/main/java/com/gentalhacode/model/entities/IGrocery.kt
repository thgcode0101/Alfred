package com.gentalhacode.model.entities

/**
 * .:.:.:. Created by @thgMatajs on 23/12/19 .:.:.:.
 */
interface IGrocery {
    var id: String
    val products: List<IProduct>
    val users: List<IUser>
    val isActive: Boolean
}