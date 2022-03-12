CREATE TABLE IF NOT EXISTS users
(
    id             BIGSERIAL primary key NOT NULL,
    first_name     VARCHAR(100)          NOT NULL,
    last_name      VARCHAR(100)          NOT NULL,
    email          VARCHAR(100)          NOT NULL,
    password       VARCHAR(100)          NOT NULL,
    admin_id       INT,
    teacher_id     INT,
    student_id     INT,
    classroom_name VARCHAR(100),
    user_type      VARCHAR(100)
);