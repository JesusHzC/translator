package com.jesushzc.translator_kmm.voice_to_tex.domain

import com.jesushzc.translator_kmm.core.domain.util.CommonStateFlow

interface VoiceToTextParser {

    val state: CommonStateFlow<VoiceToTextParserState>
    fun startListening(languageCode: String)
    fun stopListening()
    fun cancel()
    fun reset()

}