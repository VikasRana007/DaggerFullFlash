package com.learningacademy.dagger2fullflashproject

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * We have use module to create the object for like as abstract classes , interface, builder pattern classes object etc.
 */
@Module
abstract  class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }

//    @Provides
//    fun getSQLRepository(sqlRepository: SQLRepository): UserRepository {
//        // Basically we are doing here Binding of
//        // UserRepository with object of SQLRepository which is created by Dagger
//        // here we are just passing the dagger built sqlRepository
//        // object as argument params and return as it is, because already Dagger
//        created the object of SQLRepository using @Inject Annotation... point to be noted
//        return sqlRepository
//    }

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository):UserRepository
    // We Can also use @Bind annotation here as shown in the abstract function...



    // Difference between @Binds and @Provides is that while Dagger creating the object then use
//  @Binds annotation otherwise use @Provides annotation.
    // and all functions of @Binds always abstract because we not need to create object for that
// case directly we tell the return type   as shown in the example...

}