CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE chargily
(
    id             INTEGER NOT NULL,
    name           VARCHAR(255),
    email          VARCHAR(255),
    invoice_number INTEGER,
    amount         INTEGER,
    discount       DOUBLE PRECISION,
    comment        VARCHAR(255),
    CONSTRAINT pk_chargily PRIMARY KEY (id)
);