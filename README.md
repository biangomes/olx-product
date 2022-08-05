# Enunciado / Ennouncement

**PT-BR**

Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, 
mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfandêga e produtos usados possuem
data de fabricação. 
Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo. Para produtos importados,
a taxa e alfândega deve ser acrescentada ao preço final do produto.

Favor implementar o programa conforme diagrama ao lado.

**EN-US**

Build a program to read data of N products given by the user. In the end, show price tag of each product
sort by date of entry.

Each product has name and price. Imported product have a customs fee e used products have manufacture date.
These specific datas must be added in the price tag as shown below. Import product must have price tag added in the end 
of product.

Implement the program as diagram below.

# Projeto

-Product(String name, Double price)<br>
+priceTag() : String

-ImportedProduct(Double customsFee) extends Product<br>
+priceTag() : String<br>
+totalPrice() : Double

-UsedProduct(Date manufacture)<br>
+priceTag() : String

# TODO
- [ ] Implementar o diagrama de classes da atividade.