-- Inserting data into the reader table
INSERT INTO reader (reader_id, first_name, last_name, email) VALUES
                                                                 (1, 'John', 'Doe', 'john.doe@example.com'),
                                                                 (2, 'Jane', 'Smith', 'jane.smith@example.com'),
                                                                 (3, 'Michael', 'Johnson', 'michael.johnson@example.com'),
                                                                 (4, 'Emily', 'Davis', 'emily.davis@example.com'),
                                                                 (5, 'Daniel', 'Garcia', 'daniel.garcia@example.com'),
                                                                 (6, 'Sophia', 'Martinez', 'sophia.martinez@example.com'),
                                                                 (7, 'David', 'Hernandez', 'david.hernandez@example.com'),
                                                                 (8, 'Olivia', 'Lopez', 'olivia.lopez@example.com'),
                                                                 (9, 'James', 'Wilson', 'james.wilson@example.com'),
                                                                 (10, 'Isabella', 'Taylor', 'isabella.taylor@example.com');

-- Inserting data into the book table
INSERT INTO book (book_id, title, author, isbn) VALUES
                                                    (1, 'The Great Gatsby', 'F. Scott Fitzgerald', '9780743273565'),
                                                    (2, '1984', 'George Orwell', '9780451524935'),
                                                    (3, 'To Kill a Mockingbird', 'Harper Lee', '9780060935467'),
                                                    (4, 'Pride and Prejudice', 'Jane Austen', '9781853260001'),
                                                    (5, 'The Catcher in the Rye', 'J.D. Salinger', '9780316769488'),
                                                    (6, 'The Hobbit', 'J.R.R. Tolkien', '9780547928227'),
                                                    (7, 'Fahrenheit 451', 'Ray Bradbury', '9781451673319'),
                                                    (8, 'Moby Dick', 'Herman Melville', '9781503280786'),
                                                    (9, 'War and Peace', 'Leo Tolstoy', '9780199232765'),
                                                    (10, 'The Odyssey', 'Homer', '9780140268867'),
                                                    (11, 'Crime and Punishment', 'Fyodor Dostoevsky', '9780143107637'),
                                                    (12, 'Brave New World', 'Aldous Huxley', '9780060850524'),
                                                    (13, 'The Picture of Dorian Gray', 'Oscar Wilde', '9780141439570'),
                                                    (14, 'The Brothers Karamazov', 'Fyodor Dostoevsky', '9780374528379'),
                                                    (15, 'Wuthering Heights', 'Emily Brontë', '9780142437261');

-- Inserting data into the book_copy table
INSERT INTO book_copy (copy_id, book_id, availability_status) VALUES
                                                                  (1, 1, 'Available'), (2, 1, 'Available'),
                                                                  (3, 2, 'Available'), (4, 2, 'Available'),
                                                                  (5, 3, 'Available'), (6, 3, 'Available'),
                                                                  (7, 4, 'Available'), (8, 4, 'Available'),
                                                                  (9, 5, 'Available'), (10, 5, 'Available'),
                                                                  (11, 6, 'Available'), (12, 6, 'Available'),
                                                                  (13, 7, 'Available'), (14, 7, 'Available'),
                                                                  (15, 8, 'Available'), (16, 8, 'Available'),
                                                                  (17, 9, 'Available'), (18, 9, 'Available'),
                                                                  (19, 10, 'Available'), (20, 10, 'Available'),
                                                                  (21, 11, 'Available'), (22, 11, 'Available'),
                                                                  (23, 12, 'Available'), (24, 12, 'Available'),
                                                                  (25, 13, 'Available'), (26, 13, 'Available'),
                                                                  (27, 14, 'Available'), (28, 14, 'Available'),
                                                                  (29, 15, 'Available'), (30, 15, 'Available');

-- Inserting data into the librarian table
INSERT INTO librarian (librarian_id, first_name, last_name, email) VALUES
                                                                       (1, 'Alice', 'Williams', 'alice.williams@example.com'),
                                                                       (2, 'Robert', 'Brown', 'robert.brown@example.com');

-- Inserting data into the loanRecord table
INSERT INTO loanRecord (loan_id, reader_id, copy_id, loan_date, return_date) VALUES
                                                                                 (1, 1, 1, '2024-10-01', '2024-10-15'),
                                                                                 (2, 2, 3, '2024-10-02', '2024-10-16'),
                                                                                 (3, 3, 5, '2024-10-03', '2024-10-17'),
                                                                                 (4, 4, 7, '2024-10-04', '2024-10-18'),
                                                                                 (5, 5, 9, '2024-10-05', '2024-10-19'),
                                                                                 (6, 6, 11, '2024-10-06', '2024-10-20'),
                                                                                 (7, 7, 13, '2024-10-07', '2024-10-21'),
                                                                                 (8, 8, 15, '2024-10-08', '2024-10-22'),
                                                                                 (9, 9, 17, '2024-10-09', '2024-10-23'),
                                                                                 (10, 10, 19, '2024-10-10', '2024-10-24'),
                                                                                 (11, 1, 21, '2024-10-11', '2024-10-25'),
                                                                                 (12, 2, 23, '2024-10-12', '2024-10-26');

-- Inserting data into the message table (id will auto-generate)
INSERT INTO message (data) VALUES
                               ('Message 1 data'),
                               ('Message 2 data'),
                               ('Message 3 data'),
                               ('Message 4 data'),
                               ('Message 5 data'),
                               ('Message 6 data'),
                               ('Message 7 data'),
                               ('Message 8 data'),
                               ('Message 9 data'),
                               ('Message 10 data');
INSERT INTO users (username, password) VALUES ('1111', '1111');
INSERT INTO users (username, password) VALUES ('2222', '2222');

INSERT INTO roles (name) VALUES ('ROLE_User');
INSERT INTO roles (name) VALUES ('ROLE_Admin');

INSERT INTO roles_has_users (user_id, role_id) VALUES (1, 1);
INSERT INTO roles_has_users (user_id, role_id) VALUES (1, 2);
INSERT INTO roles_has_users (user_id, role_id) VALUES (2, 1);