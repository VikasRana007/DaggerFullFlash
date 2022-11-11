package com.learningacademy.dagger2fullflashproject

import java.lang.annotation.RetentionPolicy
import java.lang.annotation.RetentionPolicy.*
import javax.inject.Qualifier


@Qualifier
@MustBeDocumented
//@Retention(RetentionPolicy.RUNTIME)
annotation class MessageQualifier()         //named_qualifier
