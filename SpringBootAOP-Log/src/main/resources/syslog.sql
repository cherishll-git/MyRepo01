create table sys_log(
	id int(10) not null AUTO_INCREMENT,
	username varchar(50),
	operation varchar(50),
	time int(11),
	method varchar(200),
	params varchar(500),
	ip varchar(64),
	create_time datetime,
	primary key(id) using btree
)ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;
