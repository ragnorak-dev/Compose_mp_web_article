package com.ragnorak.cmparticle.strings

class EsStringResources : StringResources {
    override val greet: String
        get() = "Hola, soy un texto en Español"
    override val compact: String
        get() = "El estado de la vista compacta es: "
    override val expanded: String
        get() = "El estado de la vista expandida es: "
    override val demo: String
        get() = "Esto es un texto de demostración"
    override val setCompact: String
        get() = "Configura vista compacta"
    override val setExpanded: String
        get() = "Configura vista expandida"
}