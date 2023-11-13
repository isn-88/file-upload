<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
            crossorigin="anonymous"></script>
</head>
<body>

<div class="container">
<form action="/upload" method="post" enctype="multipart/form-data">

    <div class="col-6 p-2">
        <label for="formFileMultiple" class="form-label">Выберите фотографии для загрузки</label>
        <input class="form-control" type="file" name="photo" id="formFileMultiple" multiple>
    </div>

    <div class="col-6 p-2">
        <button class="btn btn-primary" type="submit">Upload</button>
    </div>

</form>
</div>

</body>
</html>
