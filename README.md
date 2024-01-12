<a href="https://www.eii.ulpgc.es" target="_blank"><img src="https://www.eii.ulpgc.es/sites/default/files/eii-acron-mod.png" alt="EII-ULPGC" align="right" width="516" height="150" /></a>
# KATA 2 DE IS2
> - Prácticas de la asignatura Ingeniería de Software II (40975) de la Escuela de Ingeniería Informática de la ULPGC
> - Realizado por Imanol Quintero Bermúdez

El siguiente repositorio tiene como objetivo desarrollar un programa que cargue un dataset en memoria, representando cada registro como un objeto y cada columna del dataset como un atributo de dicho objeto. Una vez cargado, se llevará a cabo un procesamiento básico para generar un diagrama de barras o un histograma basado en uno de los atributos del dataset.

## Tareas
Las tareas principales son:

1. Diseño de la clase:
    - Crear una clase que represente un registro del dataset. Cada atributo de esta clase representará una columna del dataset.
    - Implementar métodos básicos en la clase, como constructores, getters, setters y toString().
2. Carga del dataset:
    - Leer el archivo del dataset (puede ser un archivo CSV, Excel, JSON, entre otros).
    - Para cada registro en el archivo, crear un nuevo objeto de la clase diseñada y asignarle los valores correspondientes a sus atributos.
3. Procesamiento de datos:
    - Dependiendo del atributo seleccionado para el análisis, recorrer la lista de objetos y recopilar la información necesaria. Por ejemplo, si se desea hacer un histograma de frecuencias de edades, contar la cantidad de objetos (registros) que corresponden a cada rango de edad.
    - Almacenar estos datos procesados en una estructura adecuada, como un HashMap o cualquier otra estructura que asocie una etiqueta (rango de edad) con un valor (cantidad).
