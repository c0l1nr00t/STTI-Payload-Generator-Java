# SttiGenPayloadJava
Generator Payload

Esta herramienta fue creada para generar un payload usando la información de 
https://book.hacktricks.xyz/pentesting-web/ssti-server-side-template-injection#java

Para Java - Retrieve /etc/passwd 
pero con esta herramienta podemos generar un payload como nosotros deseemos , si se desea modificar el * por $ o algun otro, sientase libre de modificarlo en el codigo.

## Compile
  `javac myGenPayload.java`


## Usage
  `java myGenPayload command`
  
## Example
  `java myGenPayload cat ../../../../etc/passwd`
  
  
  
![Example](example.png?raw=true "Example")
