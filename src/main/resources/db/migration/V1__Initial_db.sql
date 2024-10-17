-- Creating the Reader table
CREATE TABLE IF NOT EXISTS reader (
    readerId BIGINT PRIMARY KEY,
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE
    );

-- Creation of the Book table
CREATE TABLE IF NOT EXISTS book (
    bookId BIGINT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    isbn VARCHAR(13) UNIQUE
    );

-- Creating the BookCopy table
CREATE TABLE IF NOT EXISTS book_copy (
    copyId BIGINT PRIMARY KEY,
    bookId BIGINT,
    availabilityStatus VARCHAR(50),
    FOREIGN KEY (bookId) REFERENCES book(bookId)
    );

-- Creating the Librarian table
CREATE TABLE IF NOT EXISTS librarian (
    librarianId BIGINT PRIMARY KEY,
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE
    );

-- Creating the LoanRecord table
CREATE TABLE IF NOT EXISTS loanRecord (
    loanId BIGINT PRIMARY KEY,
    readerId BIGINT,
    copyId BIGINT,
    loanDate DATE,
    returnDate DATE,
    FOREIGN KEY (readerId) REFERENCES reader(readerId),
    FOREIGN KEY (copyId) REFERENCES book_copy(copyId)
    );

-- Creating the Message table
CREATE TABLE IF NOT EXISTS message (
    id BIGSERIAL PRIMARY KEY,
    data VARCHAR(1024)
    );
