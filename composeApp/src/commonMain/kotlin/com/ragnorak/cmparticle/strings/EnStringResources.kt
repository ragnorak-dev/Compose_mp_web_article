package com.ragnorak.cmparticle.strings

class EnStringResources : StringResources {
    override val greet: String
        get() = "Hello, I'm a text in English"
    override val compact: String
        get() = "The compact view state is: "
    override val expanded: String
        get() = "The expanded view state is: "
    override val demo: String
        get() = "This is a demo text"
    override val setCompact: String
        get() = "Set compact dimensions"
    override val setExpanded: String
        get() = "Set expanded dimensions"

}