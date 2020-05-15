# Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO
Desarrollo de una Agenda Telefónica 
## Lenguaje
- Java JDK 1.8
- ID NetBeans Apache 11.3
## Librerias
- java.util.Objects;
- java.util.List;
- java.util.ArrayList;
- java.util.Collection;
- java.util.Map;
- java.util.HashMap;
# Practica
## 1. Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 03: Agenda Telefónica con MVC y DAO”
- En el link se encuentra el repositorio creado.
https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO

## 2. Desarrollar una aplicación en Java para gestionar una agenda telefónica según los requerimientos planteados en las instrucciones de la práctica

###### CLASE Usuario
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/modelo/Usuario.java
- Creación de la clase usuario implementación de sus atributos y los métodos getter y setter de cada atributo a su vez se implementa los métodos equals y hashcode de los atributos correo y contraseña, implementación de los métodos agregarTelefono, actualizarTelefono, eliminarTelefono, listas y buscar, finalmente se implementa el método toString para así poder imprimir el usuario.

###### CLASE Telefono
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/modelo/Telefono.java
- Creación de la clase teléfono implementación de sus atributos y los métodos getter y setter de cada atributo a su vez se implementa los métodos equals y hashcode del atributo codigo, , finalmente se implementa el método toString para así poder imprimir los atributos q contengan la clase teléfono.

###### INTERFACE IUsuarioDAO
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/idao/IUsuarioDAO.java
- En la esta interface se encuentran implementados los métodos CRUD y a su vez la instancia de la colección de usuarios con la que podremos acceder al método findAll.

###### INTERFACE ITelefonoDAO
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/idao/ITelefonoDAO.java
-En la esta interface se encuentran implementados los métodos CRUD y a su vez la instancia de la colección de telefonos con la que podremos acceder al método findAll.

###### CLASE UsuarioDAO
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/dao/UsuarioDAO.java
- En esta clase se encuentra la implementación de los métodos de la interface del usuario con el uso del diccionario HasMap y la Coleccione del usuario

###### CLASE TelefonoDAO
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/dao/TelefonoDAO.java
-En esta clase se encuentra la implementación de los métodos de la interface del telefono con el uso del diccionario HasMap y la Coleccione del telefono

###### CLASE VistaUsuario
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/vista/VistaUsuario.java 
- En esta clase se crea el método ingresarUsuario en el cual se ingresan por teclado todos los datos pertenecientes a los atributos de la clase usuario, se crea el método actualizarUsuario al cual pasamos primero como parámetro de búsqueda una cedula para que encuentre el usuario en la colección y después reescribir  sus atributos, se crea el método eliminar usuario el cual de la misma manera pasamos su objeto cedula para que encuentre el usuario en la colección y así poder eliminarlo, se crea el método buscar usuario con el cual se le pasa como parámetro de búsqueda un objeto cedula para buscar en la colección, se crea el método ver usuario el cual imprime al usuario, se crea el método verUsuarios el cual nos permite mandar a imprimir toda la colección de usuarios guardados en ella y finalmente se crea el metodo de iniciar sesión al cual le tendremos a pasar los objetos de correo y contraseña . 

###### CLASE VistaTelefono
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/vista/VistaTelefono.java
- En esta clase se crea el método ingresarTelefono en el cual se ingresan por teclado todos los datos pertenecientes a los atributos de la clase Telefono, se crea el método actualizarTelefono al cual pasamos primero como parámetro de búsqueda un codigo para que encuentre el telefono en la colección y después reescribir  sus atributos, se crea el método eliminarTelefono el cual de la misma manera pasamos su objeto codigo para que encuentre el telefono en la colección y así poder eliminarlo, se crea el método buscarTelefono con el cual se le pasa como parámetro de búsqueda un objeto codigo para buscar en la colección, se crea el método ver telefono el cual imprime al telefono, se crea el método verTelefono el cual nos permite mandar a imprimir toda la colección de telefonos guardados en ella .

###### CLASE ControladorUsuario
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/controlador/ControladorUsuario.java
- En esta clase se implementan los metodo que luego serán usados en la lcase principal en el metodo main de ejecución del programas por lo q se crean primerto los métodos registrar en donde se hacer un llamado a la vista del usuario al metodo igresarUsuario y al metdo creat de la clase usuarioDAO, se crea el metodo ver usuario al cual pasa el parámetro de la cedula al metodo buscar usuario en la vista del usuario y asi llama al método ver usuario el cual también se encuentra en la vista, se crea el metodo actualizar el cual llama al metodo actulizarUsuario que se encuentra en la vista usuario después llama al medo update de la clase usuarioDAO y actualiza los datos del usuario, se crea el metodo eliminar el cual llama al metodo eliminar usuario de la vista para después llamar al metodo delet de la clase usuarioDAO y lo elimina de la colección, se crea el método ver usuarios el cual imprime toda la colección de usuarios llamando al metodo verusuarios de la vista. Se crean los metodo agregar telefono, actualizar telefono, eliminar telefono, buscar telefono y listar telefono estos metodo reciben de parámetro una cedula para asi poder realizar estos métodos en sus respectivos usuarios, finalmente se crea el metdo verificar el cual nos ayuda a recorrer el arreglo e ir comparando los correos y contraseñas de los usuarios hasta encontrar los q son iguales y devolvernos un usuario.

###### CLASE ControladorTeleono
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/controlador/ControladorTelefono.java
- En esta clase se implementan los metodo que luego serán usados en la clase principal en el metodo main de ejecución del programas por lo que se crean primero los métodos registrar en donde se hacer un llamado a la vista del telefono al metodo igresarTelefono y al metdo creat de la clase TElefonoDAO, se crea el metodo ver telefono al cual pasa el parámetro del codigo al metodo buscar telefono en la vista del telefono y asi llama al método ver telefono el cual también se encuentra en la vista, se crea el metodo actualizar el cual llama al método actulizarTelefono que se encuentra en la vista telefono después llama al medo update de la clase telefonoDAO y actualiza los datos del telefono, se crea el metodo eliminar el cual llama al metodo eliminar telefono de la vista para después llamar al metodo delet de la clase telefonoDAO y lo elimina de la colección, se crea el método verTelefonos el cual imprime toda la colección de telefonos llamando al metodo verTelefonos de la vista. 

###### CLASE Principal
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/blob/master/src/main/java/ec/edu/ups/test/Principal.java
- Se crean primero un menú de selección dentro de un while para que se repita hasta que el usuario le diga que se acabe el programa, dentro del while se encuentra el menú el cual se ejecuta mediante un switch en cada caso de switch se llama a los controladores que son los encargados de hacer dichas acciones propuestas en el menú para el caso dos primero se verifica el usuario para después acceder a otro while que de la misma manera funcionara hasta que el usuario le indique ya que dentro de este encontramos otro menu que de igual forma se ejecutara a traves de otro switch.

## 3. Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación desde principio a fin.
- En el siguiente link se encuentran todos los commits subidos a la aplicación github desde el inicio del programa hasta su fin.
- https://github.com/RomelAvila2001/Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO/commits/master

# Resultados
![1](https://user-images.githubusercontent.com/64879338/82017326-861bc500-9648-11ea-9b4a-c902b7bc0b63.png)
![2](https://user-images.githubusercontent.com/64879338/82017732-6d5fdf00-9649-11ea-987d-d748c5d5faaf.png)
