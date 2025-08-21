package com.julianmindria.skeleton.domain.model

sealed interface SettingItem { val id: String }

data class SectionHeader(
    override val id: String,
    val title: String
) : SettingItem

data class ToggleItem(
    override val id: String,
    val title: String,
    val checked: Boolean
) : SettingItem

data class RadioGroupItem(
    override val id: String,
    val title: String,
    val selected: String,
    val options: List<String>
) : SettingItem

data class ActionItem(
    override val id: String,
    val title: String
) : SettingItem

data class LinkItem(
    override val id: String,
    val title: String,
    val url: String
) : SettingItem
