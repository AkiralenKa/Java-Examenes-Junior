<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="pedidos.models.Cliente, pedidos.models.Producto, pedidos.models.Pedido" %>

<html>
<head>
    <title>Sistema de Pedidos</title>
</head>
<body>

<h1>Gestión de Sistema de Pedidos</h1>


<h2>Agregar Cliente</h2>
<form action="PedidosServlet" method="post">
    <input type="hidden" name="action" value="addCliente">
    Nombre: <input type="text" name="nombreCliente" required><br>
    Email: <input type="email" name="emailCliente" required><br>
    <button type="submit">Guardar Cliente</button>
</form>


<h2>Agregar Producto</h2>
<form action="PedidosServlet" method="post">
    <input type="hidden" name="action" value="addProducto">
    Nombre: <input type="text" name="nombreProducto" required><br>
    Precio: <input type="number" step="0.01" name="precioProducto" required><br>
    <button type="submit">Guardar Producto</button>
</form>


<h2>Agregar Pedido</h2>
<form action="PedidosServlet" method="post">
    <input type="hidden" name="action" value="addPedido">
    ID Cliente: <input type="number" name="clienteId" required><br>
    ID Producto: <input type="number" name="productoId" required><br>
    Cantidad: <input type="number" name="cantidad" required><br>
    <button type="submit">Guardar Pedido</button>
</form>

<hr>


<h2>Lista de Clientes</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Email</th>
    </tr>
    <%
        List<Cliente> clientes = (List<Cliente>) request.getAttribute("clientes");
        if (clientes != null) {
            for (Cliente c : clientes) {
    %>
    <tr>
        <td><%= c.getId() %></td>
        <td><%= c.getNombre() %></td>
        <td><%= c.getEmail() %></td>
    </tr>
    <%
            }
        }
    %>
</table>


<h2>Lista de Productos</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Precio</th>
    </tr>
    <%
        List<Producto> productos = (List<Producto>) request.getAttribute("productos");
        if (productos != null) {
            for (Producto p : productos) {
    %>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getNombre() %></td>
        <td><%= p.getPrecio() %></td>
    </tr>
    <%
            }
        }
    %>
</table>


<h2>Lista de Pedidos</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>ID Cliente</th>
        <th>ID Producto</th>
        <th>Cantidad</th>
    </tr>
    <%
        List<Pedido> pedidos = (List<Pedido>) request.getAttribute("pedidos");
        if (pedidos != null) {
            for (Pedido ped : pedidos) {
    %>
    <tr>
        <td><%= ped.getId() %></td>
        <td><%= ped.getClienteId() %></td>
        <td><%= ped.getProductoId() %></td>
        <td><%= ped.getCantidad() %></td>
    </tr>
    <%
            }
        }
    %>
</table>

</body>
</html>

