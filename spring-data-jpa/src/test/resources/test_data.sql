-- AUTHOR 1 DATA

-- authors
insert into author (id, type, birth_date, first_name, last_name, literary_genre) values (1, 'WRITER', TO_DATE('1962/01/04', 'YYYY/MM/DD'), 'Harlan', 'Coben', 'CRIME');

-- books
insert into book (id, title) values (1, 'Nie mów nikomu');
insert into book (id, title) values (2, 'Wszyscy mamy tajemnice');
insert into book (id, title) values (3, 'Schronienie');
insert into book (id, title) values (4, 'Mistyfikacja');

-- book_exemplar
insert into book_exemplar (id, serial_number, book_fk) values (1, 'ISBN-0001', 1);
insert into book_exemplar (id, serial_number, book_fk) values (2, 'ISBN-0002', 1);
insert into book_exemplar (id, serial_number, book_fk) values (3, 'ISBN-0003', 1);
insert into book_exemplar (id, serial_number, book_fk) values (4, 'ISBN-0004', 1);

insert into book_exemplar (id, serial_number, book_fk) values (5, 'ISBN-0005', 2);
insert into book_exemplar (id, serial_number, book_fk) values (6, 'ISBN-0006', 2);
insert into book_exemplar (id, serial_number, book_fk) values (7, 'ISBN-0007', 2);

insert into book_exemplar (id, serial_number, book_fk) values (8, 'ISBN-0008', 3);
insert into book_exemplar (id, serial_number, book_fk) values (9, 'ISBN-0009', 3);
insert into book_exemplar (id, serial_number, book_fk) values (10, 'ISBN-0010', 3);
insert into book_exemplar (id, serial_number, book_fk) values (11, 'ISBN-0011', 3);
insert into book_exemplar (id, serial_number, book_fk) values (12, 'ISBN-0012', 3);

insert into book_exemplar (id, serial_number, book_fk) values (13, 'ISBN-0013', 4);

-- paper_book
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (1, 'HARD', 322, 'A_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (2, 'HARD', 254, 'B_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (3, 'SOFT', 443, 'A_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (4, 'HARD', 342, 'B_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (5, 'SOFT', 132, 'B_4');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (6, 'SOFT', 245, 'A_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (7, 'HARD', 523, 'A_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (8, 'SOFT', 234, 'B_4');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (9, 'HARD', 411, 'B_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (10, 'SOFT', 312, 'B_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (11, 'SOFT', 98, 'A_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (12, 'SOFT', 56, 'B_4');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (13, 'HARD', 333, 'A_4');

-- book_author
insert into book_author (author_id, book_id) values (1, 1);
insert into book_author (author_id, book_id) values (1, 2);
insert into book_author (author_id, book_id) values (1, 3);
insert into book_author (author_id, book_id) values (1, 4);

-- spoilers
insert into book_spoiler(id, book_fk, content) values (1, 1, 'Od śmierci Elizabeth z rąk seryjnego zabójcy minęło osiem lat, ale młody lekarz David Beck nie potrafi o niej zapomnieć.');

-- AUTHOR 2 DATA

-- authors
insert into author (id, type, birth_date, first_name, last_name, nick_name, literary_genre) values (2, 'WRITER', TO_DATE('1622/01/15', 'YYYY/MM/DD'), 'Harlan', 'Coben', 'Molier', 'COMEDY');

-- books
insert into book (id, title) values (5, 'Rogacz z urojenia');
insert into book (id, title) values (6, 'Szkoła mężów');
insert into book (id, title) values (7, 'Szkoła żon');
insert into book (id, title) values (8, 'Świętoszek');

-- book_exemplar
insert into book_exemplar (id, serial_number, book_fk) values (14, 'ISBN-0014', 5);
insert into book_exemplar (id, serial_number, book_fk) values (15, 'ISBN-0015', 5);
insert into book_exemplar (id, serial_number, book_fk) values (16, 'ISBN-0016', 5);
insert into book_exemplar (id, serial_number, book_fk) values (17, 'ISBN-0017', 5);

insert into book_exemplar (id, serial_number, book_fk) values (18, 'ISBN-0018', 6);
insert into book_exemplar (id, serial_number, book_fk) values (19, 'ISBN-0019', 6);
insert into book_exemplar (id, serial_number, book_fk) values (20, 'ISBN-0020', 6);

insert into book_exemplar (id, serial_number, book_fk) values (21, 'ISBN-0021', 7);
insert into book_exemplar (id, serial_number, book_fk) values (22, 'ISBN-0022', 7);
insert into book_exemplar (id, serial_number, book_fk) values (23, 'ISBN-0023', 7);
insert into book_exemplar (id, serial_number, book_fk) values (24, 'ISBN-0024', 7);
insert into book_exemplar (id, serial_number, book_fk) values (25, 'ISBN-0025', 7);

insert into book_exemplar (id, serial_number, book_fk) values (26, 'ISBN-0026', 8);

-- paper_book
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (14, 'HARD', 322, 'A_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (15, 'HARD', 254, 'B_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (16, 'SOFT', 443, 'A_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (17, 'HARD', 342, 'B_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (18, 'SOFT', 132, 'B_4');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (19, 'SOFT', 245, 'A_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (20, 'HARD', 523, 'A_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (21, 'SOFT', 234, 'B_4');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (22, 'HARD', 411, 'B_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (23, 'SOFT', 312, 'B_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (24, 'SOFT', 98, 'A_5');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (25, 'SOFT', 56, 'B_4');
insert into paper_book (book_ex_id, book_cover, pages_count, paper_size) values (26, 'HARD', 333, 'A_4');