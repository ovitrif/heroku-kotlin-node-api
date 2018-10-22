(function (_, Kotlin) {
  'use strict';
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  var Unit = Kotlin.kotlin.Unit;
  function main$lambda$ObjectLiteral() {
    this.status = 'running';
  }
  main$lambda$ObjectLiteral.$metadata$ = {
    kind: Kind_CLASS,
    interfaces: []
  };
  function main$lambda(req, res) {
    res.type('application/json');
    var response = new main$lambda$ObjectLiteral();
    return res.send(response);
  }
  function main$lambda_0() {
    println('App started on http://localhost:3000');
    return Unit;
  }
  function main(args) {
    var express = require('express');
    var app = express();
    var PORT = 3000;
    app.get('/', main$lambda);
    app.listen(PORT, main$lambda_0);
  }
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('index', _);
  return _;
}(module.exports, require('kotlin')));
