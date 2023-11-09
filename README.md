Vamos a realizar en clase una API para hacer CRUD de:
- usuarios
- productos

Pasos:
1. Clonar el proyecto: https://github.com/IES-Rafael-Alberti/springboot1_23-24.git
2. Completar los controladores:
   - Devolver respuestas adecuadas que incluyan un mensaje Http con código y cuerpo.
   - Manejo de errores a medida. Completar el Global Controller Advice, excepciones a medida para los productos.
   - Comprobar si un producto existe antes de crearlo. Si existe devolver un error de producto existente. Esto impide tener un mismo producto con varios ID. ¿Sería deseable tener  un producto repetido? Si es así, ¿como lo solucionarías?
3. Configurar CORS globalmente.
4. DTO. Estudiar si sería deseable usar DTO en el caso de tener que añadir Mappings para la relación entre usuario y producto. Razones para usar y para no usar DTO.
5. Opcional, añade una petición GET para un usuario y sus productos.