1. Все названия альбомов артиста с id = 2:

SELECT Title FROM Album WHERE ArtistId = 2;

2. Количество альбомов каждого автора:

SELECT ArtistId, COUNT(AlbumId) FROM Album GROUP BY ArtistId;

3. Количество альбомов артиста с id = 11 (GROUP BY + HAVING):

SELECT ArtistId, COUNT(AlbumId) FROM Album GROUP BY ArtistId HAVING ArtistId = 11;

4. Названия альбомов с именами авторов:

SELECT Album.Title, Artist.Name FROM Album JOIN Artist ON Album.ArtistId = Artist.ArtistId;