## cohan-demo-lambda
* Demo Cohan - Prueba Técnica Desarrollador de Software

## Descripción Cambio
* La Prima de Servicios es una prestación social que existe en Colombia y algunos países de latinoamérica. En el caso Colombiano, equivale a 30 días de salario por cada año trabajado, que el empleador debe pagar a sus trabajadores en 2 cuotas semestrales:
* La primera en el mes de Junio.
* La segunda en el mes de Diciembre.
En el siguiente [Documento](https://docs.google.com/document/d/12fiT9fERlCFEsJBnuv19cvETwrXEca2wK8LtLfxcPqg/edit?tab=t.0) puede tener mas detalle de la Epica. 

## Objetivos y Requisitos
•	No es necesario implementar los métodos descritos en el diagrama.
•	El CRUD se debe realizar sobre la entidad Person.
•	El CRUD debe quedar expuesto como servicio web SOAP, REST o ambos.
•	Preferiblemente implementar la solución en JAVA.
•	Preferiblemente usar Hibernate o JPA como ORM.
•	Se puede usar cualquier framework en el back end.
•	Se puede usar cualquier motor de base de datos relacional para la persistencia.
•	Se puede usar cualquier librería para la visualización en HTML.
•	Se puede usar cualquier servidor de aplicaciones.

## Documentación Técnica
* Amazon RDS -> PostgreSQL RDBMS

###### Modelo de Datos Actual:

###### Actualización Modelo de Datos Propuesto:
[PENDIENTE]

###### Validaciones Adicionales:

## Pruebas
[PENDIENTE]

## Monitoreo, KPIs, Evidencias
[PENDIENTE]

## Monitoreo, KPIs, Evidencias
[PENDIENTE]

## Estrategia de Despliegue
* Despliegue de la nueva versión 1.12.2.
* En caso de ocurrir algún problema, Rollback a la versión 1.12.1.
* Despliegue Canary al 1% para comprobar que el proyecto levanta correctamente.
* Despliegue Canary al 30% durante 30 minutos para monitorear que todo vaya bien.
* Despliegue Blue Green para asentar la nueva versión. 

###### Plantilla Docs Designs: https://github.com/charliesbot/design-docs/tree/main/spanish#
