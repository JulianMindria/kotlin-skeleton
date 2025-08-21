package com.julianmindria.skeleton.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStoreFile
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import com.julianmindria.skeleton.data.prefs.AppPreferences
import com.julianmindria.skeleton.data.repo.SettingsRepositoryImpl
import com.julianmindria.skeleton.domain.repo.SettingsRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

private const val DS_NAME = "settings"

@Module
@InstallIn(SingletonComponent::class)
abstract class BindModule {
    @Binds
    @Singleton
    abstract fun bindSettingsRepository(
        impl: SettingsRepositoryImpl
    ): SettingsRepository
}

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePreferencesDataStore(
        @ApplicationContext context: Context
    ): DataStore<Preferences> =
        PreferenceDataStoreFactory.create(
            produceFile = { context.preferencesDataStoreFile(DS_NAME) }
        )

    @Provides
    @Singleton
    fun provideAppPreferences(
        ds: DataStore<Preferences>
    ): AppPreferences = AppPreferences(ds)
}
