package com.gentalhacode.alfred.di

import com.gentalhacode.alfred.model.ViewUser
import com.gentalhacode.model.entities.IUser
import com.gentalhacode.util.SharedUtil
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * .:.:.:. Created by @thgMatajs on 29/12/19 .:.:.:.
 */
val appModule = module {
    single { ViewUser.getUser() }
    single { SharedUtil(androidContext()) }
}