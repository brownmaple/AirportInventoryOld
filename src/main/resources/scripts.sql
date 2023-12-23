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
	  REFERENCES worker_objects(worker_object_id),
);