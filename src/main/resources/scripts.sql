create table material_object_types (
	material_objecttype_id INT,
	material_objecttype_name varchar,
	material_objecttype_parent INT,
	material_objecttype_description varchar,
	PRIMARY KEY(material_objecttype_id)
);

create table material_objects (
	material_object_id INT,
	material_object_name varchar,
	material_object_parent INT,
	material_objecttype_id INT not null,
	material_description varchar,
	PRIMARY KEY(material_object_id),
	CONSTRAINT fk_mobjects_objecttype
      FOREIGN KEY(material_objecttype_id)
	  REFERENCES material_object_types(material_objecttype_id)
);

create table worker_objects (
	worker_object_id INT,
	worker_object_name varchar,
	worker_object_parent INT,
	worker_objecttype_id INT null,
	worker_description varchar,
	PRIMARY KEY(worker_object_id)
);

create table material_worker (
	material_object_id INT,
	worker_object_id INT,
	PRIMARY KEY(material_object_id),
	CONSTRAINT fk_matworker_materialobject
      FOREIGN KEY(material_object_id)
	  REFERENCES material_objects(material_object_id),
	CONSTRAINT fk_matworker_workerobject
      FOREIGN KEY(worker_object_id)
	  REFERENCES worker_objects(worker_object_id)
);

--need to create a view to join tables and calculate some columns (status of materials) data for the pages

insert into ai_material_type values(101,null,'irondoor',null);
insert into ai_material_type values(102,null,'laptop',null);
insert into ai_material_type values(103,null,'toolbox',null);
insert into ai_material_type values(104,null,'camera',null);
insert into ai_material_type values(105,null,'keys',null);
insert into ai_material_type values(106,null,'ladder',null);

insert into ai_material values(201,null,'hp',102,null);
insert into ai_material values(202,null,'lenovo',102,null);
insert into ai_material values(203,null,'asus',102,null);
insert into ai_material values(204,null,'dell',102,null);
insert into ai_material values(205,null,'nikon',104,null);
insert into ai_material values(206,null,'sony',104,null);