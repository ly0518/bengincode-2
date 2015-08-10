CREATE TABLE blog_type(
    blog_type_id         INT                     AUTO_INCREMENT,
    blog_type_name       NATIONAL VARCHAR(20),
    delete_flag          CHAR(1),
    begincode_user_id    INT,
    PRIMARY KEY (blog_type_id), 
    CONSTRAINT Refbegincode_user441 FOREIGN KEY (begincode_user_id)
    REFERENCES begincode_user(begincode_user_id)
)ENGINE=INNODB
;

CREATE TABLE blog(
    blog_id                    INT                      AUTO_INCREMENT,
    blog_info                  NATIONAL VARCHAR(400)    NOT NULL,
    prohibition_message        CHAR(1)                  NOT NULL,
    begincode_keys             NATIONAL VARCHAR(100),
    view_count                 INT                      NOT NULL,
    blog_content               TEXT                     NOT NULL,
    create_datetime            DATETIME,
    delete_flag                CHAR(1),
    good_count                 INT                      NOT NULL,
    bad_count                  INT                      NOT NULL,
    release_state              CHAR(1)                  NOT NULL,
    check_flag                 CHAR(1)                  NOT NULL,
    blog_type_name             NATIONAL VARCHAR(20),
    blog_abstract              NATIONAL VARCHAR(500),
    nickname                   NATIONAL VARCHAR(50),
    pic                        NATIONAL VARCHAR(200),
    blog_type_id               INT,
    begincode_navigation_id    INT,
    begincode_user_id          INT,
    PRIMARY KEY (blog_id), 
    CONSTRAINT Refbegincode_navigation411 FOREIGN KEY (begincode_navigation_id)
    REFERENCES begincode_navigation(begincode_navigation_id),
    CONSTRAINT Refbegincode_user421 FOREIGN KEY (begincode_user_id)
    REFERENCES begincode_user(begincode_user_id),
    CONSTRAINT Refblog_type431 FOREIGN KEY (blog_type_id)
    REFERENCES blog_type(blog_type_id)
)ENGINE=INNODB
;



CREATE TABLE blog_comment(
    blog_comment_id         INT                       AUTO_INCREMENT,
    blog_comment_content    NATIONAL VARCHAR(1000)    NOT NULL,
    create_datatime         DATETIME                  NOT NULL,
    nickname                NATIONAL VARCHAR(50),
    pic                     NATIONAL VARCHAR(200),
    comment_status          CHAR(1)                   NOT NULL,
    order_number            INT,
    begincode_user_id       INT,
    blog_id                 INT,
    PRIMARY KEY (blog_comment_id), 
    CONSTRAINT Refbegincode_user451 FOREIGN KEY (begincode_user_id)
    REFERENCES begincode_user(begincode_user_id),
    CONSTRAINT Refblog461 FOREIGN KEY (blog_id)
    REFERENCES blog(blog_id)
)ENGINE=INNODB
;



