/* exemple 1 
 * 
 * (function(){
 var app = angular.module('myApp', []);
 
 app.controller('MyController', ['$scope', function($scope) {
 $scope.last_update = undefined;
 $scope.$watch('name', function() {
 $scope.last_update = new Date();
 });
 }]);
 })();*/

/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/
/* exemple 2
 * 
 * (function() {
 'use strict';
 
 var app = angular.module('mainApp', []);
 
 app.controller('MainCtrl', function() {
 this.object = {};
 this.list = [];
 
 this.add = function() {
 this.list.push(this.object);
 this.object = {};
 };
 });
 })();*/

/*---------------------------------------------------------------------------------------------------------------------------------------------------------*/
/* exemple 3 
 (function() {
 'use strict';
 
 var myModule = angular.module('myModule', []);
 
 myModule.service('helloo', function($window) {
 return {
 welcome: function(name) {
 $window.alert('A bloc ' + name + '!!!!!');
 }
 };
 });
 
 var app = angular.module('myApp', ['myModule']);
 app.controller('MyController', ['$scope', 'helloo', function($scope, hello) {
 $scope.sayHello = function(name) {
 hello.welcome(name);
 console.log(name);
 };
 }]);
 })();*/
/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/
/* exemple 4
 (function() {
 'use strict';
 
 var app = angular.module('myApp', []);
 app.config(function() {
 console.log('configuration of my app.');
 });
 app.controller('MyController', function($window) {
 this.sayHello = function(name) {
 $window.alert('Hello ' + name);
 };
 });
 })();*/
/*-------------------------------------------------------------------------------------------------------------------------------------------------------------*/

(function () {
    'use strict';
    
    var app = angular.module('myApp', []);
    app.controller('myCtrl', function ($scope, $http) {
        $http({
            method: "GET",
            url: "message.html"
        })
        .then (function success(response) {
            $scope.myWelcome = response.data;
        });
    });
});