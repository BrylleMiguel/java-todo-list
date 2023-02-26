CREATE TABLE IF NOT EXISTS todo_list (
    id DOUBLE,
    name VARCHAR(30),
    -- BIT store values from 1 - 64, TRUE is equivalent to 1, otherwise 0 for false
    done BIT
);