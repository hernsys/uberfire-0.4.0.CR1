function TodoCtrl($scope) {

    $scope.placeText = "MiscellaneousFeatures";

    $scope.todos = [
        {text: 'learn angular', done: true},
        {text: 'build an angular app', done: false}
    ];

    $scope.addTodo = function () {
        $scope.todos.push({text: $scope.todoText, done: false});
        $scope.todoText = '';
    };

    $scope.remaining = function () {
        var count = 0;
        angular.forEach($scope.todos, function (todo) {
            count += todo.done ? 0 : 1;
        });
        return count;
    };

    $scope.archive = function () {
        var oldTodos = $scope.todos;
        $scope.todos = [];
        angular.forEach(oldTodos, function (todo) {
            if (!todo.done) {
                $scope.todos.push(todo);
            }
        });
    };

    $scope.goto = function () {
        $goToPlace($scope.placeText);
    };
}

$registerPlugin({
    id: "my angular js",
    type: "angularjs",
    templateUrl: "angular.sample.html",
    title: function () {
        return "angular " + Math.floor(Math.random() * 10);
    },
    on_close: function () {
        alert("this is a pure JS alert!");
    }
});
