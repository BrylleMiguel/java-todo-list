CREATE TABLE IF NOT EXISTS todo (
    id IDENTITY,
    name VARCHAR(30) NOT NULL,
    date_created TIMESTAMP --
    -- BIT store values from 1 - 64, TRUE is equivalent to 1, otherwise 0 for false
    -- done BIT
);