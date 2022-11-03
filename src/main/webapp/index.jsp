<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.blog.dao.DaoTeste" %>
<%@ page import="com.blog.entidades.Teste" %>


<!-- Para tirar o bug de letras -->
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Home</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
  <link rel="stylesheet" href="../style/style.css">
  <script src="../script/script.js" defer></script>
</head>

<body class="d-flex flex-column" style="min-height: 100vh;">

  <header class="container-fluid text-center bg-info p-1">
    <div class="d-flex flex-row justify-content-between align-items-center">
      <a href="./login.jsp" id="bt_login_home" class="mw-120px"><button class="btn btn-outline-dark"><i class="bi bi-door-open-fill mw-120px"></i> Login</button></a>
      <button class="btn btn-outline-dark d-off" id="bt_logout_home" onclick="btLogout()"><i class="bi bi-door-open-fill mw-120px"></i> Logout</button>
      <i class="bi bi-person-circle text-bg-info mw-120px"> User</i>
    </div>
  </header>

  <section class="text-bg-dark flex-grow-1 container-fluid">
    <div class="row">
      <div class="col border border-info p-4 text-container" data-id="6">
        <h3 class="fw-bolder">teste</h3>
        <p class="text-blog" style="display: block;" data-text="Lorem ipsum dolor sit, amet consectetur adipisicing elit. Dolorem non, odio possimus ex alias voluptas minus rem accusamus quis aliquid sunt praesentium! Dolores voluptatibus perspiciatis temporibus aut error praesentium soluta asperiores nulla quas, dicta sapiente, veniam delectus eaque. Praesentium, est temporibus earum quae blanditiis magni soluta cupiditate fugit eum a iusto itaque, laborum veniam. Ipsa qui nobis ratione, eos et quisquam quos adipisci eum possimus dolorem dolore sed tempora nihil ab quaerat sit repellat illum, deserunt, aperiam ducimus voluptatum ex minus corrupti doloremque? Perspiciatis corporis assumenda, facere fugit nulla inventore porro odit id. Repudiandae, vel atque quis voluptate facilis reprehenderit!" data-hidden="true">
          Lorem ipsum dol...
        </p>
        <button class="btn btn-outline-info mw-120px s-h-button" onclick="showHideContent('6')">Show</button>
        <div class="p-tb-10">
          <h3 class="fw-bolder fs-6">Comments <span class="note d-off">| Note: Log in to comment</span></h3>
          <input type="text" class="form-control d-off comment" placeholder="Comment here!">
          <button class="btn btn-outline-info mw-120px d-off comment" onclick="sendContent()">Send</button>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col border border-info p-4 text-container" data-id="7">
        <h3 class="fw-bolder">teste</h3>
        <p class="text-blog" style="display: block;" data-text="Lorem ipsum dolor sit, amet consectetur adipisicing elit. Dolorem non, odio possimus ex alias voluptas minus rem accusamus quis aliquid sunt praesentium! Dolores voluptatibus perspiciatis temporibus aut error praesentium soluta asperiores nulla quas, dicta sapiente, veniam delectus eaque. Praesentium, est temporibus earum quae blanditiis magni soluta cupiditate fugit eum a iusto itaque, laborum veniam. Ipsa qui nobis ratione, eos et quisquam quos adipisci eum possimus dolorem dolore sed tempora nihil ab quaerat sit repellat illum, deserunt, aperiam ducimus voluptatum ex minus corrupti doloremque? Perspiciatis corporis assumenda, facere fugit nulla inventore porro odit id. Repudiandae, vel atque quis voluptate facilis reprehenderit!" data-hidden="true">
          Lorem ipsum dol...
        </p>
        <button class="btn btn-outline-info mw-120px s-h-button" onclick="showHideContent('7')">Show</button>
        <div class="p-tb-10">
          <h3 class="fw-bolder fs-6">Comments <span class="note d-off">| Note: Log in to comment</span></h3>
          <p>Não sei oq lá</p>
          <p>Não sei oq lá</p>
          <p>Não sei oq lá</p>
          <p>Não sei oq lá</p>
          <input type="text" class="form-control d-off comment" placeholder="Comment here!">
          <button class="btn btn-outline-info mw-120px d-off comment" onclick="sendContent()">Send</button>
        </div>
      </div>
    </div>
  </section>

  <footer class="text-bg-info text-end p-1 fs-6">
    Thanks for comming
  </footer>

  <%

  %>

</body>

</html>
