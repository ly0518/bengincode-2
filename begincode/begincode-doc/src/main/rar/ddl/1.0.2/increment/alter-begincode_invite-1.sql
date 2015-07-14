CREATE TABLE begincode_invite(
    begincode_invite_id    INT                     AUTO_INCREMENT,
    invite_code            NATIONAL VARCHAR(20),
    begincode_user_id      INT,
    use_flag               CHAR(1),
    invited_user_id        INT,
    create_datetime        DATETIME,
    PRIMARY KEY (begincode_invite_id), 
    CONSTRAINT Refbegincode_user301 FOREIGN KEY (begincode_user_id)
    REFERENCES begincode_user(begincode_user_id)
)ENGINE=INNODB
;


