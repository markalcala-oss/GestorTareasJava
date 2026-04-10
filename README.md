Explicación del uso de POO en el Proyecto
En este proyecto se han aplicado los pilares fundamentales de la Programación Orientada a Objetos para garantizar un código limpio, organizado y escalable:

1. Encapsulamiento
Se aplicó en la clase Tarea, donde los atributos nombre y completada son privados (private). El acceso a estos datos se realiza exclusivamente a través de métodos públicos (Getters y Setters), protegiendo la integridad de la información.

2. Abstracción
Se creó la clase Tarea para representar un objeto del mundo real dentro del software, abstrayendo solo las propiedades necesarias (descripción y estado) y ocultando la complejidad del manejo de datos.

3. Modularidad y Separación de Responsabilidades (MVC)
El proyecto sigue el patrón de diseño Modelo-Vista-Controlador:

Modelo (Tarea.java): Gestiona los datos y la lógica del objeto.

Vista (VistaTarea.java): Se encarga exclusivamente de la interfaz gráfica y los componentes de Swing.

Controlador (ControladorTareas.java): Actúa como intermediario, gestionando los eventos (clics de botones) y comunicando la vista con el modelo.

4. Uso de Colecciones y Tipado
Se utilizó la clase DefaultListModel<Tarea> para manejar dinámicamente la lista de objetos, aprovechando el polimorfismo y la capacidad de Java para manejar colecciones de objetos personalizados.
