[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Můj blog</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<div class="seznam">
    <h1>Seznam vsech blogu</h1>
    [#list posts.content]
        <table class="u-full-width">
            <thead>
            <tr>
                <th scope="col">Slug</th>
                <th scope="col">Jmeno autora</th>
                <th scope="col">Titulek zapisku</th>
                <th scope="col">Kod prvniho odstavce</th>
                <th scope="col">Pokracovani zapisku</th>
            </tr>
            </thead>
            <tbody>
            [#items as post]
                <tr>
                    <td>
                        <a href="http://localhost:8080/post/${post.slug?no_esc}" class="page">${post.slug?no_esc}</a>
                    </td>
                    <td>${post.author}</td>
                    <td>${post.title}</td>
                    <td>${post.perex}</td>
                    <td>${post.body}</td>
                </tr>
            [/#items]
            </tbody>
        </table>
    [#else]
        <div>Seznam postu je prazdny.</div>
    [/#list]
    <div class="totalCount">Celkem nalezeno ${posts.totalElements} zaznamu.</div>
</div>
</body>
</html>
