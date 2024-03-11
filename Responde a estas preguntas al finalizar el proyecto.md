
### Tras finalizarr el proyecto, responde de forma concisa (máximo 1 párrafo) y clara a las siguientes preguntas que te darán indicios de  tu grado de entendimiento del patrón Strategy

- ¿Cuáles son las estrategias?

Es quien declara la interfaz común a todos los algoritmos permitidos y es usada por el contexto. En nuestro caso será la interfaz Ataque.

- ¿Está el código de las diferentes ataques  mezclado?¿El código del ataque con espada es independiente del código del ataque con arco?  .Relaciona esto con algún principio SOLID.

No están mezclados, cáda código es independiente siguiendo el Single Responsibility Principle.

- ¿Para que vale la interface Ataque?

Sirve para definir una familia de algoritmos (en nuestro caso distintos algoritmos de ataque), encapsular cada uno de ellos y hacerlos intercambiables.

- ¿Qué clase o clase se encarga del papel de contexto?

El papel de contexto (intermediario entre la interfaz y el cliente) será la clase Personaje en caso de nuestro programa.

- ¿En que se parece y  en que se diferencia el  contexto de tu proyecto al contexto del Patrón teórico del boletín?

Aplican las estrategias de forma distinta, sin embargo ambos comunican el cliente con las estrategias como función principal.

- ¿Quién es el Cliente?

Para este simulador de combates será la clase ControlLucha.

- ¿Como cambia el cliente de  estrategia?

Mediante el método setAtaque() de la clase Persona.

- ¿Para cambiar de estrategia, tiene que conocer el cliente detalles de implementación de la estrategia?

El objetivo del método es permitir cambiar de estrategia conociendo únicamente la interfaz, por lo que conocer como está implementada no es necesario.

- ¿Si creamos un nuevo tipo de ataque para un nuevo cliente, por ejemplo App2,  es
necesario modificar el cliente antiguo? Relaciona esto con algún principio SOLID.

No es necesario por el Open/Closed Principle: “Cerrado para modificación, abierto para extensión”
