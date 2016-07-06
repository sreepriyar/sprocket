function RSClient($scope, $http) {
    $http.get('http://localhost:8080/Sprocket/user1').
        success(function(data) {
            $scope.sprocket = data;
            $scope.sprocketDetail = data.detailHistory;
            $scope.total= 0;
            $scope.amount= 0;
            $scope.action=["BUY", "SELL"];
            $scope.selectedaction=$scope.action[0];
        });
}	