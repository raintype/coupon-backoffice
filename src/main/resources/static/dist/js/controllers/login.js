loginModule = angular.module('loginApp', [])
loginModule.controller('LoginCtrl', function() {
    var login = this;

    login.check = function() {
        alert('test');
    };
});