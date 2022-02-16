#language: es
Característica: Registro de estudiante
  Yo como estudiante de TOOLSQA
  Deseo registrarme en el portal web
  Para tomar clases


  @RegistarInformacionDeEstudiante
  Escenario: Validar los estudiantes puedan registrar su informacion en el portal
    Dado que el estudiante ingresa al portal de registro
    Cuando el estudiante ingresa su informacion en el formulario
      | nombre  | apellido | email                    | genero | celular    | cumpleano        | asignatura                     | hobbies      | imagen                           | direccion          | estado  | ciudad  |
      | Usuario | Prueba   | usuario.prueba@gmail.com | Male   | 3235522222 | 20-December-1990 | Maths,Physics,Computer Science | Sports,Music | src/test/resources/data/foto.png | Carrera 1 # 23- 3a | Haryana | Panipat |
    Entonces el estudiante podra visualizar mensaje que informe que se envio la informacion