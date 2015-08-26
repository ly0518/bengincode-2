CREATE TABLE recommend(
    recommend_id       INT         AUTO_INCREMENT,
    recommend_type     CHAR(1),
    content_id         INT,
    create_datetime    DATETIME,
    delete_flag        CHAR(1),
    PRIMARY KEY (recommend_id)
)ENGINE=INNODB
;



