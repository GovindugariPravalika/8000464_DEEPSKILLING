CREATE TABLE stock(
    st_id INT PRIMARY KEY AUTO_INCREMENT,
    st_code VARCHAR(10),
    st_date DATE,
    st_open DECIMAL(10,2),
    st_close DECIMAL(10,2),
    st_volume BIGINT
);