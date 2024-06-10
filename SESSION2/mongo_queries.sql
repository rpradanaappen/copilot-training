db.users.find();

db.users.find({ name: 'John' });

db.getCollectionNames();

db.users.find().sort({ salary: 1 });

db.users.find().sort({ salary: -1 });

db.users.aggregate([
    {
        $lookup: {
            from: 'addresses',
            localField: 'id',
            foreignField: 'user_id',
            as: 'addresses'
        }
    }
]);

db.users.find({ name: /^B/ });

db.users.find({ name: /a$/ });
