package com.playground.dummyservice.data

/**
 * Class for providing test data for tests.
 */
class TestData {
    static final
    def APP_URL = System.getProperty("app.instance.service.url") ?: "http://localhost:8031"
    static final def CLIENT_HOST_URL = APP_URL + "/api/"
    static final def PROGRAM_ID_LIST = ["10001", "11100", "20002", "33333", "12345"]
    static final def CORRELATION_ID_LIST = ["10001", "11100", "20002", "33333", "12345"]
    static final def PARENT_ID_LIST = ["Parent1", "Parent2", "Parent3", "Parent4", "Parent5"]
    static final def PARENT_TYPE_LIST = ["P1", "P2", "P3", "P4", "P5"]
    static final def USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_2) AppleWebKit/601.3.9 (KHTML, like Gecko) Version/9.0.2 Safari/601.3.9"
    static final def IP_ADDRESS_LIST = ["162.161.243.93", "252.223.228.184", "172.172.12.207", "3.128.24.196", "147.5.170.128", "2001:0db8:0000:0000:0000:ff00:0042:8329", "3001:0db8:0100:0000:0000:ff00:0042:8329"]
    static final def COUNTRY_CODE_LIST = ["US", "CN", "GB", "SA", "AU"]
    static final def APP_NAME_LIST = ["Safari", "FireFox", "Opera", "Chrome", "Edge"]
    static final def AGENT_NAME_LIST = ["Safari"]
    static final def AGENT_VERSION_LIST = ["9"]
    static final def DEVICE_TYPE_LIST = ["DESKTOP"]
    static final def DEVICE_MANUFACTURER_LIST = ["Apple"]
    static final def DEVICE_BRAND_LIST = ["Apple Macintosh"]
    static final def POSITIVE_INTEGERS_LIST = [1, 2, 3, 10, 100, 1000]
    static final def NEGATIVE_INTEGERS_LIST = [-1, -2, -3, -10, -100, -1000]


    /**
     * Strings for DB tests.
     */
    static final def INJECT_CREATE_COLLECTION = "db.createCollection(\"inventory\")"
    static final def INJECT_COLLECTION_DOCUMENTS = "db.inventory.insertMany([\n" +
            "   { item: \"journal\", qty: 25, tags: [\"blank\", \"red\"], size: { h: 14, w: 21, uom: \"cm\" } },\n" +
            "   { item: \"mat\", qty: 85, tags: [\"gray\"], size: { h: 27.9, w: 35.5, uom: \"cm\" } },\n" +
            "   { item: \"mousepad\", qty: 25, tags: [\"gel\", \"blue\"], size: { h: 19, w: 22.85, uom: \"cm\" } }\n" +
            "])"
    static final def IP_V4_REGEX = "[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[\\*]{1,3}"
    static final
    def LONG_TEXT = "A narrative or story is a report of connected events, real or imaginary, presented in a sequence of written or spoken words, or still or moving images,[1][2] or both. The word derives from the Latin verb narrare, \"to tell\", which is derived from the adjective gnarus, \"knowing\" or \"skilled\".[3]\n" +
            "Narrative can be organized in a number of thematic or formal categories: non-fiction (such as definitively including creative non-fiction, biography, journalism, transcript poetry, and historiography); fictionalization of historical events (such as anecdote, myth, legend, and historical fiction); and fiction proper (such as literature in prose and sometimes poetry, such as short stories, novels, and narrative poems and songs, and imaginary narratives as portrayed in other textual forms, games, or live or recorded performances).\n" +
            "Narrative is found in all forms of human creativity, art, and entertainment, including speech, literature, theatre, music and song, comics, journalism, film, television and video, video games, radio, gameplay, unstructured recreation, and performance in general, as well as some painting, sculpture, drawing, photography, and other visual arts, as long as a sequence of events is presented. Several art movements, such as modern art, refuse the narrative in favor of the abstract and conceptual.\n" +
            "Oral storytelling is the earliest method for sharing narratives.[4] During most people's childhoods, narratives are used to guide them on proper behavior, cultural history, formation of a communal identity, and values, as especially studied in anthropology today among traditional indigenous peoples.[5]\n" +
            "Narratives may also be nested within other narratives, such as narratives told by an unreliable narrator (a character) typically found in noir fiction genre. An important part of narration is the narrative mode, the set of methods used to communicate the narrative through a process narration (see also \"Narrative Aesthetics\" below).\n" +
            "Along with exposition, argumentation, and description, narration, broadly defined, is one of four rhetorical modes of discourse. More narrowly defined, it is the fiction-writing mode in which the narrator communicates directly to the reader." +
            "A narrative or story is a report of connected events, real or imaginary, presented in a sequence of written or spoken words, or still or moving images,[1][2] or both. The word derives from the Latin verb narrare, \"to tell\", which is derived from the adjective gnarus, \"knowing\" or \"skilled\".[3]\n" +
            "Narrative can be organized in a number of thematic or formal categories: non-fiction (such as definitively including creative non-fiction, biography, journalism, transcript poetry, and historiography); fictionalization of historical events (such as anecdote, myth, legend, and historical fiction); and fiction proper (such as literature in prose and sometimes poetry, such as short stories, novels, and narrative poems and songs, and imaginary narratives as portrayed in other textual forms, games, or live or recorded performances).\n" +
            "Narrative is found in all forms of human creativity, art, and entertainment, including speech, literature, theatre, music and song, comics, journalism, film, television and video, video games, radio, gameplay, unstructured recreation, and performance in general, as well as some painting, sculpture, drawing, photography, and other visual arts, as long as a sequence of events is presented. Several art movements, such as modern art, refuse the narrative in favor of the abstract and conceptual.\n" +
            "Oral storytelling is the earliest method for sharing narratives.[4] During most people's childhoods, narratives are used to guide them on proper behavior, cultural history, formation of a communal identity, and values, as especially studied in anthropology today among traditional indigenous peoples.[5]\n" +
            "Narratives may also be nested within other narratives, such as narratives told by an unreliable narrator (a character) typically found in noir fiction genre. An important part of narration is the narrative mode, the set of methods used to communicate the narrative through a process narration (see also \"Narrative Aesthetics\" below).\n" +
            "Along with exposition, argumentation, and description, narration, broadly defined, is one of four rhetorical modes of discourse. More narrowly defined, it is the fiction-writing mode in which the narrator communicates directly to the reader." +
            "A narrative or story is a report of connected events, real or imaginary, presented in a sequence of written or spoken words, or still or moving images,[1][2] or both. The word derives from the Latin verb narrare, \"to tell\", which is derived from the adjective gnarus, \"knowing\" or \"skilled\".[3]\n" +
            "Narrative can be organized in a number of thematic or formal categories: non-fiction (such as definitively including creative non-fiction, biography, journalism, transcript poetry, and historiography); fictionalization of historical events (such as anecdote, myth, legend, and historical fiction); and fiction proper (such as literature in prose and sometimes poetry, such as short stories, novels, and narrative poems and songs, and imaginary narratives as portrayed in other textual forms, games, or live or recorded performances).\n" +
            "Narrative is found in all forms of human creativity, art, and entertainment, including speech, literature, theatre, music and song, comics, journalism, film, television and video, video games, radio, gameplay, unstructured recreation, and performance in general, as well as some painting, sculpture, drawing, photography, and other visual arts, as long as a sequence of events is presented. Several art movements, such as modern art, refuse the narrative in favor of the abstract and conceptual.\n" +
            "Oral storytelling is the earliest method for sharing narratives.[4] During most people's childhoods, narratives are used to guide them on proper behavior, cultural history, formation of a communal identity, and values, as especially studied in anthropology today among traditional indigenous peoples.[5]\n" +
            "Narratives may also be nested within other narratives, such as narratives told by an unreliable narrator (a character) typically found in noir fiction genre. An important part of narration is the narrative mode, the set of methods used to communicate the narrative through a process narration (see also \"Narrative Aesthetics\" below).\n" +
            "Along with exposition, argumentation, and description, narration, broadly defined, is one of four rhetorical modes of discourse. More narrowly defined, it is the fiction-writing mode in which the narrator communicates directly to the reader."
}
