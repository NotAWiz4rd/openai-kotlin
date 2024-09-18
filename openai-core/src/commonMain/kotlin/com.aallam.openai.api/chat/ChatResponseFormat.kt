package com.aallam.openai.api.chat

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

/**
 * An object specifying the format that the model must output.
 */
@Serializable
public data class ChatResponseFormat(
    /**
     * Response format type.
     */
    @SerialName("type") val type: String,
    /**
     * Json format that is to be used when type is given as 'json_schema'. Ignored otherwise.
     */
    @SerialName("json_schema") val jsonSchema: JsonObject? = null
) {

    public companion object {
        /**
         * JSON mode, which guarantees the message the model generates, is valid JSON.
         */
        public val JsonObject: ChatResponseFormat = ChatResponseFormat(type = "json_object")

        /**
         * Default text mode.
         */
        public val Text: ChatResponseFormat = ChatResponseFormat(type = "text")
    }
}
