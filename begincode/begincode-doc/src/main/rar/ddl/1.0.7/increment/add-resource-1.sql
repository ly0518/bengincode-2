CREATE TABLE resource_type(
    resource_type_id      INT                     AUTO_INCREMENT,
    resource_type_name    NATIONAL VARCHAR(10),
    del_flag              INT,
    PRIMARY KEY (resource_type_id)
)ENGINE=INNODB
;


CREATE TABLE resource(
    resource_id          INT                      AUTO_INCREMENT,
    resource_name        NATIONAL VARCHAR(100),
    resource_abstract    NATIONAL VARCHAR(200),
    resource_content     TEXT,
    down_addr            NATIONAL VARCHAR(100),
    del_flag             INT,
    resource_type_id     INT,
    PRIMARY KEY (resource_id), 
    CONSTRAINT Refresource_type491 FOREIGN KEY (resource_type_id)
    REFERENCES resource_type(resource_type_id)
)ENGINE=INNODB
;





