## API usuario-producto

Vamos a realizar en clase una API para hacer CRUD de:
- usuarios
- productos

Pasos:
1. Clonar el proyecto: https://github.com/IES-Rafael-Alberti/springboot1_23-24.git
2. Completar los controladores:
   - Devolver respuestas adecuadas que incluyan un mensaje Http con código y cuerpo.
   - Manejo de errores a medida. Completar el Global Controller Advice, excepciones a medida para los productos.
   - Comprobar si un producto existe antes de crearlo. Si existe devolver un error de producto existente. Esto impide tener un mismo producto con varios ID. ¿Sería deseable tener un producto repetido? Si es así, ¿cómo lo solucionarías?
3. Configurar CORS globalmente.
4. DTO. Estudiar si sería deseable usar DTO en el caso de tener que añadir Mappings para la relación entre usuario y producto. Razones para usar y para no usar DTO.
5. Opcional, añade una petición GET para un usuario y sus productos.

   ![img.png](img.png)

### RESPUESTAS
2.¿Sería deseable tener un producto repetido? Si es así, ¿cómo lo solucionarías?

Si, seria deseable tener un producto repetido, ya que ahora no es posible que otro usuario compre el mismo producto.
La solución seria implementar una logica que permita la creacion de productos iguales, con el mismo nombre pero con diferente ID

4.Estudiar si sería deseable usar DTO en el caso de tener que añadir Mappings para la relación entre usuario y producto. 
Razones para usar y para no usar DTO.

Los DTOs permiten separar la representación de los datos en la capa de presentación (o de transferencia) de la lógica empresarial. 
Teniendo esto en cuanta si la aplicación es simple puede ser excesivo añadir DTOs, ya que aumenta la cantidad de código.
Por otro lado para aplicaciones grandes y/o complejas si son necesrios, ademas evita que se "vea" la estructura de datos empleada en la API evitan el acoplamiento y facilita la independencia de la capas entre otras cosas.
