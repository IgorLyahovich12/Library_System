-- Creating the Reader table
CREATE TABLE IF NOT EXISTS reader (
                                      reader_id BIGINT PRIMARY KEY,
                                      first_name VARCHAR(255) NOT NULL,
                                      last_name VARCHAR(255) NOT NULL,
                                      email VARCHAR(255) UNIQUE
);

-- Creation of the Book table
CREATE TABLE IF NOT EXISTS book (
                                    book_id BIGINT PRIMARY KEY,
                                    title VARCHAR(255) NOT NULL,
                                    author VARCHAR(255) NOT NULL,
                                    isbn VARCHAR(13) UNIQUE
);

-- Creating the BookCopy table
CREATE TABLE IF NOT EXISTS book_copy (
                                         copy_id BIGINT PRIMARY KEY,
                                         book_id BIGINT,
                                         availability_status VARCHAR(50),
                                         FOREIGN KEY (book_id) REFERENCES book(book_id)
);

-- Creating the Librarian table
CREATE TABLE IF NOT EXISTS librarian (
                                         librarian_id BIGINT PRIMARY KEY,
                                         first_name VARCHAR(255) NOT NULL,
                                         last_name VARCHAR(255) NOT NULL,
                                         email VARCHAR(255) UNIQUE
);

-- Creating the LoanRecord table
CREATE TABLE IF NOT EXISTS loanRecord (
                                          loan_id BIGINT PRIMARY KEY,
                                          reader_id BIGINT,
                                          copy_id BIGINT,
                                          loan_date DATE,
                                          return_date DATE,
                                          FOREIGN KEY (reader_id) REFERENCES reader(reader_id),
                                          FOREIGN KEY (copy_id) REFERENCES book_copy(copy_id)
);

-- Creating the Message table
CREATE TABLE IF NOT EXISTS message (
                                       id BIGSERIAL PRIMARY KEY,
                                       data VARCHAR(1024)
);